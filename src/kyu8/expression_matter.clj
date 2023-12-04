(ns kyu8.expression-matter)

(defn expression-matter [a b c]
  (max
    (+ a b c)
    (* a b c)
    (+ a (* b c))
    (* a (+ b c))
    (+ (* a b) c)
    (* (+ a b) c)))

; test
(println (expression-matter 1 2 3))