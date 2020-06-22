(ns are-they-same.core)

(defn are-squares?
  [a b]
  (and (some? a)
       (some? b)
       (=
         (sort (map * a a))
         (sort b))))

(are-squares? [1 2 3 4] [9 1 4])

(are-squares? [121, 144, 19, 161, 19, 144, 19, 11]
              [121, 14641, 20736, 36100, 25921, 361, 20736, 361])






