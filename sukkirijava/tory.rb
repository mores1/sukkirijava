puts "整数1"
a = gets.to_i
puts "整数2"
b = gets.to_i
puts "整数3"
c = gets.to_i
puts "何番目の数字を求めますか？"
t = gets.to_i

n = 0
while n < (t - 3)
  d = a + b + c
  a = b
  b = c
  c = d
  n += 1
end

puts "#{t}番目の数は#{c}です"