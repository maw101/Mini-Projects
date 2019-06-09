module Factorial where

-- Simple Factorial function without the use of loops

factorial :: Int -> Integer
factorial n = scanl (*) 1 [1..] !! n