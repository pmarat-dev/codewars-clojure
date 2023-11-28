; Regex count lowercase letters
; https://www.codewars.com/kata/56a946cd7bd95ccab2000055

(defn lowercase_count [str]
  (count (re-seq #"[a-z]" str)))

; test
(println (lowercase_count "Hello World!"))
