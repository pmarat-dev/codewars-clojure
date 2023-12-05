; Sum of Positive
; https://www.codewars.com/kata/5715eaedb436cf5606000381

(defn positive-sum [xs]
  (reduce + (filter pos? xs)))

; test
(println (positive-sum [1 -3 2 3]))