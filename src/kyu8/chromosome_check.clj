; Determine offspring sex based on genes XX and XY chromosomes
; https://www.codewars.com/kata/56a946cd7bd95ccab2000055

(defn chromosome-check [sperm]
  ({"XY" "Congratulations! You're going to have a son."
    "XX" "Congratulations! You're going to have a daughter."} sperm))

; test
(println (chromosome-check "XX"))
