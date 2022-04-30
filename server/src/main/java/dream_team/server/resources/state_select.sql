SELECT dreams.States.stateName, 
        dreams.DistrictPlans.PlanName,
        dreams.Districts.DistrictNum,
        dreams.Districts.Area,
        dreams.Districts.Perimeter,
        dreams.Districts.Incrumbent,
        dreams.Districts.Population,
        dreams.Districts.VoteRep,
        dreams.Districts.VoteDem,
        dreams.Demographics.White,
        dreams.Demographics.Black,
        dreams.Demographics.Asian,
        dreams.Demographics.AmericanIndianandAlaskaNative,
        dreams.Demographics.NativeHawaiianandOtherPacificIslander,
        dreams.Demographics.Hispanic
FROM dreams.States
JOIN dreams.DistrictPlans
ON dreams.States.stateID = dreams.DistrictPlans.stateID
JOIN dreams.Districts
ON dreams.Districts.PlanName = dreams.DistrictPlans.PlanName
JOIN dreams.Demographics
ON dreams.Districts.demographicsID = dreams.Demographics.demographicsID
WHERE dreams.DistrictPlans.StateID = '1';