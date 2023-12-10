; Printer Errors
; https://www.codewars.com/kata/56541980fa08ab47a0000040

(defn printer-error [s]
  (str (count (re-seq #"[n-z]" s)) "/" (count s)))

; test
(println (printer-error "test"))
