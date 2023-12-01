; Beginner - Lost Without a Map
; https://www.codewars.com/kata/57f781872e3d8ca2a000007e

(defn maps [xs]
  (map #(* 2 %) xs))

; test
(println (maps [1 2 3 4]))