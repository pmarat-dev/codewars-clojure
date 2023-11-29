; Parse nice int from char problem
; https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/

(defn how-old [her-old]
  (Integer/parseInt (subs her-old 0 1)))

; test
(println (how-old "2 years old"))
