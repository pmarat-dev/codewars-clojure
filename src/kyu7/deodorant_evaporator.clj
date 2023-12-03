; Deodorant Evaporator
; https://codewars.com/kata/5506b230a11c0aeab3000c1f

(defn evaporator [evap_per_day, threshold]
  (count (take-while #(> % threshold) (iterate #(* % (- 100 evap_per_day) 0.01) 100))))

; test
(println (evaporator 10 5))
