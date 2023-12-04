; Fake Binary
; https://www.codewars.com/kata/57eae65a4321032ce000002d
(require '[clojure.string :as string])

(defn fake-bin [x]
  (string/replace (string/replace x #"[0-4]" "0") #"[5-9]" "1"))

; test
(println (fake-bin 126748))