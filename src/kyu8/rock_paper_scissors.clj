; Rock Paper Scissors!
; https://www.codewars.com/kata/5672a98bdbdd995fad00000f

(def wins #{["rock" "scissors"] ["scissors" "paper"] ["paper" "rock"]})

(defn rps [p1 p2]
  (cond
    (wins [p1 p2]) "Player 1 won!"
    (= p1 p2) "Draw!"
    :else "Player 2 won!"))

; test
(println (rps "paper" "scissors"))