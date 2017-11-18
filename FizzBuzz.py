class FizzBuzz:
    FIZZBUZZ = "fizzbuzz"
    FIZZ = "fizz"
    BUZZ = "buzz"
    NONFIZZBUZZ = ""

    def isFizz(self, i):
        return 0 == (i % 3)

    def isBuzz(self, i):
        return 0 == (i % 5)

    def isFizzBuzz(self, i):
        return self.isBuzz(i) & self.isFizz(i)

    def getFizzBuzz(self, i):
        return self.FIZZBUZZ if self.isFizzBuzz(i) else self.FIZZ if self.isFizz(i) else self.BUZZ if self.isBuzz(i) else self.NONFIZZBUZZ

class Main:
    # This is run to test it atm
    def runMe(self):
        for i in range(1, 50):
            print(str(i) + " = " + FizzBuzz.getFizzBuzz(self, i))