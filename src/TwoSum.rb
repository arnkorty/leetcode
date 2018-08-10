def two_sum(nums, target)
    nums.each_with_index do |num, i|
        if nums[(i + 1)..-1].include?(target - nums[i])
            return [i, i + 1 + nums[(i+1)..-1].index(target - nums[i])]
        end
    end
end
