; Sort and Star
; https://www.codewars.com/kata/57cfdf34902f6ba3d300001e

(require '[clojure.string :as string])

(defn star-sort [arr]
  (string/join "***" (first (sort arr))))

; test
(println (star-sort ["bitcoin" "take" "over" "the" "world" "maybe" "who" "knows" "perhaps"]))