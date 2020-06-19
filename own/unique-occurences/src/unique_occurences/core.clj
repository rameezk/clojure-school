(ns unique-occurences.core
  (:require [clojure.string :as str]))

(defn count-repeating-chars
  [word]
  (->> word
       (str/lower-case)
       frequencies
       vals
       (filter #(> % 1))
       count))

(count-repeating-chars "aabbccd")
