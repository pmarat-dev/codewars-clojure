; Returning Strings
; https://www.codewars.com/kata/55a70521798b14d4750000a4

(defn greet [name]
  (format "Hello, %s how are you doing today?" name))

; test
(println (greet "Piotr"))
