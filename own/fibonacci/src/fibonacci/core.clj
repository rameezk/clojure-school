(ns fibonacci.core)

(def fib-seq
  ((fn fib [a b]
     (lazy-seq (cons a (fib b (+ a b)))))
   0 1))

(take 0 fib-seq)

(defn fibonacci
  [n]
  (if (neg? n)
    nil
    (if (= n 0)
      0
      (last (take (inc n) fib-seq)))))

