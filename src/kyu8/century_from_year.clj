; Century From Year
; https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097

(defn century [year]
  (int (+ 1 (/ (- year 1) 100))))

; test
(println (century 1703))
