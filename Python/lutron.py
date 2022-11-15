class Database:
    def __init__(self):
        self.db = list()

    def add_message(self, message, time_m):
        if not self.is_valid_time(time_m):
            return False

        self.db.append((time_m, message))
        self.db = self.db.sort(, lambda data: data[0])
        return True

    def get_message(self, time_m):
        if not self.is_valid_time(time_m):
            return ""

        return self.binary_search(time_m)

    def binary_search(self, time_bound):
        lower = 0
        upper = len(self.db) - 1

        while lower <= upper:
            mid = lower + (upper - lower) / 2

            (curr_time_m, message) = self.db[mid]
            if time_bound >= curr_time_m:  # 9 <= 12

        return "Initializing..."

    def is_valid_time(self, time_m):
        return time_m >= "00:00" and time_m <= "23:59"


def main():
    db = Database()
    db.add_message("Good morning!", "06:00")  # 24 hour
    db.add_message("Good evening!", "19:00")
    db.add_message("Good afternoon!", "12:00")

    # [("6:00", "Good morning!"), ("19:00", "Good evening!"), ("12:00", "Good afternoon!")]

    while True:
        current_time = sys.time()  # "13:01"

        message = db.get_message(current_time)

        if len(message) > 0:
            display.update(message)
