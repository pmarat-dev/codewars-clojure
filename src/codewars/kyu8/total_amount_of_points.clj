; Total amount of points
; https://www.codewars.com/kata/5bb904724c47249b10000131

(defn score [game]
  (let [x (int (first game))
        y (int (last game))]
    (cond (> x y) 3 (< x y) 0 :else 1)))

(defn points [games]
  (reduce + (map score games)))

; test
(println (points ["1:0" "2:0" "0:4" "5:5"]))
