(ns intro-to-strings.core-test
  (:require [clojure.test :refer :all]
            [intro-to-strings.core :refer :all]))

(deftest a-test
  (is (=
        "CLOJURE"
        (intro-to-strings.core/uppercase "clojure"))))
