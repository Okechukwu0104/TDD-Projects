import unittest
import arrayswap

class TestArrayswap(unittest.TestCase):
	def test_to_check_if_function_exist(self):
		arrayswap.execute([1,2,3,4,5])	

	def test_to_check_if_the_test_works(self):
		self.assertEqual(arrayswap.execute([1,2,3,4,5]),[2,1,4,3,5])