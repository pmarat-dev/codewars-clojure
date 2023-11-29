; Localize The Barycenter of a Triangle
; https://www.codewars.com/kata/5601c5f6ba804403c7000004

(defn bar-triang [[a b] [c d] [e f]]
  [(read-string (format "%.4f" (/ (+ a c e) 3.)))
   (read-string (format "%.4f" (/ (+ b d f) 3.)))])

; test
(println (bar-triang [4, 6], [12, 4], [10, 10]))
