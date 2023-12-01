; Find the Slope
; https://www.codewars.com/kata/55a75e2d0803fea18f00009d

(defn slope [[x1 y1 x2 y2]]
  (cond
    (= x1 x2) "undefined"
    :else (str (/ (- y2 y1) (- x2 x1)))))

; test
(println (slope [1 2 3 2]))
