(ns rock-paper-scissors.core
  (:require [[clojure.spec.alpha :as s]
             [clojure.spec.gen.alpha :as g]]))

(def dominated-by
  {:rock     :scissors
   :paper    :rock
   :scissors :paper})

