; Grasshopper - Terminal game move function
; https://www.codewars.com/kata/563a631f7cbbc236cf0000c2

(defn move [position roll]
  (+ position (* 2 roll)))

; test
(println (move 3 6))
