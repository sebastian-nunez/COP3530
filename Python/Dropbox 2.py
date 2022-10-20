class Database:
    def __init__(self):
        self.db = dict()

    def SET(self, key, field, value):
        if not self.db.get(key):
            self.db[key] = dict()

        self.db[key][field] = value
        return ""

    def GET(self, key, field):
        if not self.db.get(key) or not self.db.get(key).get(field):
            return ""

        return self.db.get(key).get(field)

    def DELETE(self, key, field):
        if not self.db.get(key) or not self.db.get(key).get(field):
            return "false"

        self.db.get(key).pop(field)
        return "true"

    def SCAN(self, key, prefix):
        output = []
        if not self.db.get(key):
            return ""

        for field in self.db.get(key):
            if prefix == "" or field.startswith(prefix):
                output.append(f"{field}({self.GET(key, field)})")

        sorted(output)
        return ", ".join(output)


def solution(queries):
    db = Database()
    output = []

    for query in queries:
        [operation, *params] = query

        if operation == "SET":
            [key, field, value] = params
            output.append(db.SET(key, field, value))
        elif operation == "GET":
            [key, field] = params
            output.append(db.GET(key, field))
        elif operation == "DELETE":
            [key, field] = params
            output.append(db.DELETE(key, field))
        elif operation == "SCAN":
            [key, prefix] = params
            output.append(db.SCAN(key, prefix))
        else:
            output.append("")

    return output


if __name__ == "__main__":
    queries = [["SET", "employee", "city", "Annapolis"],
               ["SET", "employee", "id", "0123"],
               ["SCAN", "employee", ""]]

    print(solution(queries))
