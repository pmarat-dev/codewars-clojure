; Convert a String to a Number!
; https://www.codewars.com/kata/544675c6f971f7399a000e79

(defn string-to-number [str]
  (read-string str))

; test
(println (string-to-number "123.456"))
