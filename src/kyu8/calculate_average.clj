; Calculate average
; https://www.codewars.com/kata/57a2013acf1fa5bfc4000921

(defn find-average [numbers]
  (double (/ (reduce + numbers) (count numbers))))

; test
(println (find-average [1 2 3 4]))
