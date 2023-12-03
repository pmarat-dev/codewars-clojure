; String Repeat
; https://www.codewars.com/kata/57a0e5c372292dd76d000d7e

(defn repeat-str [n s]
  (apply str (repeat n s)))

; test
(println (repeat-str 3 "hello"))
