(ns rock-paper-scissors.core
  (:require [clojure.spec.alpha :as s]))

(def hand? #{:rock :paper :scissors})

(s/def ::hand hand?)
(s/def ::player1 (s/keys :req [::hand]))
(s/def ::player2 (s/keys :req [::hand]))
(s/def ::players (s/keys :req [::player1 ::player2]))
(s/def ::game (s/keys :req [::players]))

(def dominates
  {:rock     :scissors
   :paper    :rock
   :scissors :paper})

(defn determine-winner
  [game]
  (let [player1-hand (get-in game [::players ::player1 ::hand])
        player2-hand (get-in game [::players ::player2 ::hand])]
    (if (= player1-hand player2-hand)
      :draw
      (if (= (player1-hand dominates) player2-hand)
        :player1
        :player2))))

(defn play
  [game]
  (determine-winner game))

(s/fdef play
  :args (s/cat :game ::game)
  :ret ::game
  :fn #(play %))

(s/exercise-fn `play 20)
