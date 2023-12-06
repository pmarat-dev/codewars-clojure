; Beginner Series #2 Clock
; https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a

(defn past [h m s]
  (* 1000 (+ (* h 3600) (* m 60) s)))

; test
(println (past 1 1 1))
