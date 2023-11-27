; https://www.codewars.com/kata/56a946cd7bd95ccab2000055
; Regex count lowercase letters

(defn lowercase_count [str]
  (count (re-seq #"[a-z]" str)))

(println (lowercase_count "Hello World!"))
