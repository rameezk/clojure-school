(ns intro-to-strings.core
  (:require [clojure.string :as s]))

(defn uppercase
  [str] (s/upper-case str))
