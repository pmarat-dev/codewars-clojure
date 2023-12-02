(defn century [year]
  (int (+ 1 (/ (- year 1) 100))))

; test
(println (century 1703))