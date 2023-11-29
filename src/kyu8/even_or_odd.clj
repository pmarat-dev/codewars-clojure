(defn even-or-odd [number]
  (cond
    (odd? number) "Odd"
    (even? number) "Even"))

; test
(println (even-or-odd 4))
(println (even-or-odd 5))
