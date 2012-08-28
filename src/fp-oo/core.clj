(ns fpoop.core)

; Exercise 1:
; Given what you know now, can you define a function second that returns the second element of a list? That is, fill in the blank in this:
(def second (fn
              [list]
              (nth list 1)))

; Exercise 2:
; Give two implementations of third, which returns the third element of a list.
(def third (fn
             [list]
             (nth list 2)))

(def third (fn
             [list]
             (first (rest (rest list)))))

; Exercise 3:
; Implement add-squares.
(def add-squares (fn
                   [& list]
                   (apply + (map * list list))))

; Exercise 4:
; The range function produces a sequence of numbers:
(def factorial (fn
                 [num]
                 (apply * (range 1 (inc num)))))

; Exercise 5:
; Below, I give a list of functions that work on lists or vectors. For each one, think of a problem it could solve, and solve it. For example, we’ve already solved two problems:
; take
;; Find the two lowest multipliers of a factorial
(take 2 (factorial 5))
; distinct
;; Find out how many numbers in a vector are duplicated 
(def some_dups [1 2 2 3 4 5 6 6])
(- (count some_dups) (count (distinct some_dups)))
; concat
;; Say hello
(def hello (fn [name]
             (str (concat "hello" name))))
(hello "Jedidiah")
