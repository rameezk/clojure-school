(ns fibonacci.core-test
  (:require [clojure.test :refer :all]
            [fibonacci.core :refer :all]))

(deftest a-test
  (is (nil? (fibonacci.core/fibonacci -1)))
  (is (= 0 (fibonacci.core/fibonacci 0)))
  (is (= 1 (fibonacci.core/fibonacci 1)))
  (is (= 2 (fibonacci.core/fibonacci 3)))
  (is (= 4181 (fibonacci.core/fibonacci 19))))
