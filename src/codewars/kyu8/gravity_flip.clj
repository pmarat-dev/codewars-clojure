; Gravity Flip
; https://www.codewars.com/kata/5f70c883e10f9e0001c89673

(defn flip [d a]
  (sort (case d \R < \L >) a))

; test
(println (flip \R [3 4 2 6 1]))
(println (flip \L [3 4 2 6 1]))
