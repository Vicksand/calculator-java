# test_calculator.py
import unittest
from calculator import calculate_ideal_weight

class TestCalculateIdealWeight(unittest.TestCase):

    def test_male_ideal_weight(self):
        result = calculate_ideal_weight("male", 170)
        self.assertEqual(result, 65.5)

    def test_female_ideal_weight(self):
        result = calculate_ideal_weight("female", 160)
        self.assertEqual(result, 54.1)

    def test_male_ideal_weight_with_correction(self):
        result = calculate_ideal_weight("male", 180)
        self.assertEqual(result, 73.0)

    def test_female_ideal_weight_with_correction(self):
        result = calculate_ideal_weight("female", 155)
        self.assertEqual(result, 50.5)

if __name__ == '__main__':
    unittest.main()
