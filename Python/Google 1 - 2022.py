#
# Complete the 'canParkCar' function below.
#
# The function is expected to return a BOOLEAN.
# The function accepts following parameters:
#  1. INTEGER carLen
#  2. INTEGER streetLen
#  3. INTEGER_ARRAY carLocations
#  4. INTEGER_ARRAY carLengths
#

def canParkCar(carLen, streetLen, carLocations, carLengths):
    if not carLocations and carLen <= streetLen:  # no cars are parked, and your's fits
        return True

    if len(carLocations) == streetLen:  # no available spots
        return False

    location_set = set(carLocations)  # O(1) acess time

    spot = 0
    current_car = 0
    available_len = 0
    while spot < streetLen:  # O(streetLen)
        if available_len == carLen:
            return True

        if spot in location_set:  # if there is a car at this spot,
            spot += carLengths[current_car]  # skip to next available spot
            available_len = 0
            current_car += 1

        available_len += 1
        spot += 1

    return False


if __name__ == '__main__':
    print(canParkCar(2, 10, [1, 4, 8], [1, 2, 2]))  # _ x _ _ x x _ _ x x
    print(canParkCar(2, 9, [0, 3, 6], [2, 2, 2]))   # x x _ x x _ x x _
    print(canParkCar(2, 3, [], []))                 # _ _ _
    print(canParkCar(6, 4, [], []))                 # _ _
    print(canParkCar(2, 3, [0, 1, 2], [1, 1, 1]))   # x x x
