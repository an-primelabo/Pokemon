INSERT INTO pkm_move_flags (move_flag_id, name, name_alias, description) VALUES
(1, 'Makes contact', 'contact', 'User touches the target.  This triggers some abilities (e.g., []{ability:static}) and items (e.g., []{item:sticky-barb}).'),
(2, 'Has a charging turn', 'charge', 'This move has a charging turn that can be skipped with a []{item:power-herb}.'),
(3, 'Must recharge', 'recharge', 'The turn after this move is used, the Pokémon''s action is skipped so it can recharge.'),
(4, 'Blocked by Detect and Protect', 'protect', 'This move will not work if the target has used []{move:detect} or []{move:protect} this turn.'),
(5, 'Reflectable', 'reflectable', 'This move may be reflected back at the user with []{move:magic-coat} or []{ability:magic-bounce}.'),
(6, 'Snatchable', 'snatch', 'This move will be stolen if another Pokémon has used []{move:snatch} this turn.'),
(7, 'Copied by Mirror Move', 'mirror', 'A Pokémon targeted by this move can use []{move:mirror-move} to copy it.'),
(8, 'Punch-based', 'punch', 'This move has 1.2× its usual power when used by a Pokémon with []{ability:iron-fist}.'),
(9, 'Sound-based', 'sound', 'Pokémon with []{ability:soundproof} are immune to this move.'),
(10, 'Unusable during Gravity', 'gravity', 'This move cannot be used in high []{move:gravity}.'),
(11, 'Defrosts when used', 'defrost', 'This move can be used while frozen to force the Pokémon to defrost.'),
(12, 'Targets opposite side in triples', 'distance', 'In triple battles, this move can be used on either side to target the farthest away opposing Pokémon.'),
(13, 'Heals', 'heal', 'This move is blocked by []{move:heal-block}.'),
(14, 'Ignores Substitute', 'authentic', 'This move ignores the target''s []{move:substitute}.'),
(15, 'Powder-based', 'powder', 'Pokémon with []{ability:overcoat} and []{type:grass}-type Pokémon are immune to this move.'),
(16, 'Jaw-based', 'bite', 'This move has 1.5× its usual power when used by a Pokémon with []{ability:strong-jaw}.'),
(17, 'Pulse-based', 'pulse', 'This move has 1.5× its usual power when used by a Pokémon with []{ability:mega-launcher}.'),
(18, 'Ballistics-based', 'ballistics', 'This move is blocked by []{ability:bulletproof}.'),
(19, 'Mental effects', 'mental', 'This move is blocked by []{ability:aroma-veil} and cured by []{item:mental-herb}.'),
(20, 'Unusable during Sky Battles', 'non-sky-battle', 'This move is unusable during Sky Battles.'),
(21, 'Dance', 'dance', 'This move triggers []{ability:dancer}.');