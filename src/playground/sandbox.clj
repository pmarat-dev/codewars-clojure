; Century From Year
; https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097

(defn century [year]
  (int (+ 1 (/ (- year 1) 100))))

(defn fibo [x]
  (cond (= x 0) 0
        (= x 1) 1
        :else (+
                (fibo (- x 2))
                (fibo (- x 1)))))

(defn factorial [x]
  (cond (= x 1) 1
        :else (* x (factorial (dec x)))))

; test
(println (factorial 5))
