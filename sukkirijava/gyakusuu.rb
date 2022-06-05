sum = 0
100000000.times do |timesCount|
  count = timesCount + 1
  sum += 1.0/count
  if sum >= 15
   puts sum
   puts count
   return
  end
end

999999