--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.12
-- Dumped by pg_dump version 9.4.12
-- Started on 2017-10-05 13:49:40

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 2 (class 3079 OID 11855)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2619 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


--
-- TOC entry 1 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 2620 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET search_path = public, pg_catalog;

--
-- TOC entry 287 (class 1259 OID 17164)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE hibernate_sequence OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 179 (class 1259 OID 16611)
-- Name: pkm_abilities; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_abilities (
    ability_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32),
    short_effect text,
    effect text,
    generation_id integer,
    is_main_series boolean DEFAULT true
);


ALTER TABLE pkm_abilities OWNER TO postgres;

--
-- TOC entry 180 (class 1259 OID 16620)
-- Name: pkm_ability_changelog; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_ability_changelog (
    ability_changelog_id integer NOT NULL,
    ability_id integer,
    changed_in_version_group_id integer,
    effect text
);


ALTER TABLE pkm_ability_changelog OWNER TO postgres;

--
-- TOC entry 181 (class 1259 OID 16628)
-- Name: pkm_ability_flavor_text; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_ability_flavor_text (
    ability_id integer,
    version_group_id integer,
    flavor_text text
);


ALTER TABLE pkm_ability_flavor_text OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 16634)
-- Name: pkm_berries; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_berries (
    berry_id integer NOT NULL,
    item_id integer,
    berry_firmness_id integer,
    natural_gift_power integer,
    natural_gift_type_id integer,
    size integer,
    max_harvest integer,
    growth_time integer,
    soil_dryness integer,
    smoothness integer
);


ALTER TABLE pkm_berries OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 16639)
-- Name: pkm_berry_firmness; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_berry_firmness (
    berry_firmness_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_berry_firmness OWNER TO postgres;

--
-- TOC entry 184 (class 1259 OID 16644)
-- Name: pkm_berry_flavors; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_berry_flavors (
    berry_id integer,
    contest_type_id integer,
    flavor integer
);


ALTER TABLE pkm_berry_flavors OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 16647)
-- Name: pkm_characteristics; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_characteristics (
    characteristic_id integer NOT NULL,
    stat_id integer,
    gene_mod_5 integer,
    message character varying(256)
);


ALTER TABLE pkm_characteristics OWNER TO postgres;

--
-- TOC entry 288 (class 1259 OID 17185)
-- Name: pkm_conquest_episode_warriors; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_episode_warriors (
    conquest_episode_warrior_id integer,
    conquest_warrior_id integer
);


ALTER TABLE pkm_conquest_episode_warriors OWNER TO postgres;

--
-- TOC entry 186 (class 1259 OID 16652)
-- Name: pkm_conquest_episodes; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_episodes (
    conquest_episode_id integer NOT NULL,
    name character varying(256),
    name_alias character varying(256)
);


ALTER TABLE pkm_conquest_episodes OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 16668)
-- Name: pkm_conquest_kingdoms; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_kingdoms (
    conquest_kingdom_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    type_id integer
);


ALTER TABLE pkm_conquest_kingdoms OWNER TO postgres;

--
-- TOC entry 188 (class 1259 OID 16673)
-- Name: pkm_conquest_max_links; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_max_links (
    conquest_warrior_rank_id integer,
    pokemon_species_id integer,
    max_link integer
);


ALTER TABLE pkm_conquest_max_links OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 16676)
-- Name: pkm_conquest_move_data; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_move_data (
    conquest_move_id integer,
    power integer,
    accuracy integer,
    effect_chance integer,
    conquest_move_effect_id integer,
    conquest_move_range_id integer,
    conquest_move_displacement_id integer
);


ALTER TABLE pkm_conquest_move_data OWNER TO postgres;

--
-- TOC entry 190 (class 1259 OID 16679)
-- Name: pkm_conquest_move_displacements; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_move_displacements (
    conquest_move_displacement_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32),
    affects_target integer,
    short_effect text,
    effect text
);


ALTER TABLE pkm_conquest_move_displacements OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 16687)
-- Name: pkm_conquest_move_effects; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_move_effects (
    conquest_move_effect_id integer NOT NULL,
    short_effect text,
    effect text
);


ALTER TABLE pkm_conquest_move_effects OWNER TO postgres;

--
-- TOC entry 192 (class 1259 OID 16696)
-- Name: pkm_conquest_move_ranges; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_move_ranges (
    conquest_move_range_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32),
    targets integer,
    description text
);


ALTER TABLE pkm_conquest_move_ranges OWNER TO postgres;

--
-- TOC entry 193 (class 1259 OID 16704)
-- Name: pkm_conquest_pokemon_abilities; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_pokemon_abilities (
    pokemon_species_id integer,
    slot integer,
    ability_id integer
);


ALTER TABLE pkm_conquest_pokemon_abilities OWNER TO postgres;

--
-- TOC entry 194 (class 1259 OID 16707)
-- Name: pkm_conquest_pokemon_evolution; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_pokemon_evolution (
    evolved_species_id integer,
    required_stat_id integer,
    minimum_stat integer,
    minimum_link integer,
    conquest_kingdom_id integer,
    warrior_gender_id integer,
    item_id integer,
    recruiting_ko_required boolean DEFAULT false
);


ALTER TABLE pkm_conquest_pokemon_evolution OWNER TO postgres;

--
-- TOC entry 195 (class 1259 OID 16711)
-- Name: pkm_conquest_pokemon_moves; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_pokemon_moves (
    pokemon_species_id integer,
    conquest_move_id integer
);


ALTER TABLE pkm_conquest_pokemon_moves OWNER TO postgres;

--
-- TOC entry 196 (class 1259 OID 16714)
-- Name: pkm_conquest_pokemon_stats; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_pokemon_stats (
    pokemon_species_id integer,
    conquest_stat_id integer,
    base_stat integer
);


ALTER TABLE pkm_conquest_pokemon_stats OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 16717)
-- Name: pkm_conquest_stats; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_stats (
    conquest_stat_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    is_base boolean DEFAULT true
);


ALTER TABLE pkm_conquest_stats OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 16723)
-- Name: pkm_conquest_transformation_pokemon; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_transformation_pokemon (
    conquest_transformation_pokemon_id integer,
    pokemon_species_id integer
);


ALTER TABLE pkm_conquest_transformation_pokemon OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 16726)
-- Name: pkm_conquest_transformation_warriors; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_transformation_warriors (
    conquest_transformation_warrior_id integer,
    present_warrior_id integer
);


ALTER TABLE pkm_conquest_transformation_warriors OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 16729)
-- Name: pkm_conquest_warrior_archetypes; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_warrior_archetypes (
    conquest_warrior_archetype_id integer NOT NULL,
    name_alias character varying(32)
);


ALTER TABLE pkm_conquest_warrior_archetypes OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16739)
-- Name: pkm_conquest_warrior_rank_stat_map; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_warrior_rank_stat_map (
    conquest_warrior_rank_id integer,
    conquest_warrior_stat_id integer,
    base_stat integer
);


ALTER TABLE pkm_conquest_warrior_rank_stat_map OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 16742)
-- Name: pkm_conquest_warrior_ranks; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_warrior_ranks (
    conquest_warrior_rank_id integer NOT NULL,
    conquest_warrior_id integer,
    rank integer,
    conquest_warrior_skill_id integer
);


ALTER TABLE pkm_conquest_warrior_ranks OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16747)
-- Name: pkm_conquest_warrior_skills; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_warrior_skills (
    conquest_warrior_skill_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32)
);


ALTER TABLE pkm_conquest_warrior_skills OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 16752)
-- Name: pkm_conquest_warrior_specialties; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_warrior_specialties (
    conquest_warrior_id integer,
    type_id integer,
    slot integer
);


ALTER TABLE pkm_conquest_warrior_specialties OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16755)
-- Name: pkm_conquest_warrior_stats; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_warrior_stats (
    conquest_warrior_stat_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_conquest_warrior_stats OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 16760)
-- Name: pkm_conquest_warrior_transformation; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_warrior_transformation (
    transformed_warrior_rank_id integer,
    is_automatic boolean DEFAULT false,
    required_link integer,
    completed_episode_id integer,
    current_episode_id integer,
    distant_warrior_id integer,
    female_warlord_count integer,
    pokemon_count integer,
    collection_type_id integer,
    warrior_count integer
);


ALTER TABLE pkm_conquest_warrior_transformation OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16734)
-- Name: pkm_conquest_warriors; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_conquest_warriors (
    conquest_warrior_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    gender_id integer,
    conquest_warrior_archetype_id integer
);


ALTER TABLE pkm_conquest_warriors OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 16764)
-- Name: pkm_contest_combos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_contest_combos (
    first_move_id integer,
    second_move_id integer
);


ALTER TABLE pkm_contest_combos OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 16767)
-- Name: pkm_contest_effects; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_contest_effects (
    contest_effect_id integer NOT NULL,
    appeal integer,
    jam integer,
    flavor_text text,
    effect text
);


ALTER TABLE pkm_contest_effects OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 16775)
-- Name: pkm_contest_types; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_contest_types (
    contest_type_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    flavor character varying(16),
    color character varying(16)
);


ALTER TABLE pkm_contest_types OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 16780)
-- Name: pkm_egg_groups; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_egg_groups (
    egg_group_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_egg_groups OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 16790)
-- Name: pkm_encounter_condition_value_map; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_encounter_condition_value_map (
    encounter_id integer,
    encounter_condition_value_id integer
);


ALTER TABLE pkm_encounter_condition_value_map OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16793)
-- Name: pkm_encounter_condition_values; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_encounter_condition_values (
    encounter_condition_value_id integer NOT NULL,
    encounter_condition_id integer,
    name character varying(32),
    name_alias character varying(32),
    is_default boolean DEFAULT false
);


ALTER TABLE pkm_encounter_condition_values OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 16785)
-- Name: pkm_encounter_conditions; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_encounter_conditions (
    encounter_condition_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(16)
);


ALTER TABLE pkm_encounter_conditions OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16799)
-- Name: pkm_encounter_methods; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_encounter_methods (
    encounter_method_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32),
    order_no integer
);


ALTER TABLE pkm_encounter_methods OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16804)
-- Name: pkm_encounter_slots; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_encounter_slots (
    encounter_slot_id integer NOT NULL,
    version_group_id integer,
    encounter_method_id integer,
    slot integer,
    rarity integer
);


ALTER TABLE pkm_encounter_slots OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16809)
-- Name: pkm_encounters; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_encounters (
    encounter_id integer NOT NULL,
    version_id integer,
    location_area_id integer,
    encounter_slot_id integer,
    pokemon_id integer,
    min_level integer,
    max_level integer
);


ALTER TABLE pkm_encounters OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 16814)
-- Name: pkm_evolution_chains; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_evolution_chains (
    evolution_chain_id integer NOT NULL,
    baby_trigger_item_id integer
);


ALTER TABLE pkm_evolution_chains OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16819)
-- Name: pkm_evolution_triggers; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_evolution_triggers (
    evolution_trigger_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_evolution_triggers OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16824)
-- Name: pkm_experience; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_experience (
    growth_rate_id integer,
    level integer,
    experience integer
);


ALTER TABLE pkm_experience OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16827)
-- Name: pkm_genders; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_genders (
    gender_id integer NOT NULL,
    name_alias character varying(16)
);


ALTER TABLE pkm_genders OWNER TO postgres;

--
-- TOC entry 175 (class 1259 OID 16593)
-- Name: pkm_generations; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_generations (
    generation_id integer NOT NULL,
    region_id integer,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_generations OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 16833)
-- Name: pkm_growth_rates; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_growth_rates (
    growth_rate_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32),
    formula text
);


ALTER TABLE pkm_growth_rates OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 16841)
-- Name: pkm_item_categories; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_item_categories (
    item_category_id integer NOT NULL,
    item_pocket_id integer,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_item_categories OWNER TO postgres;

--
-- TOC entry 224 (class 1259 OID 16846)
-- Name: pkm_item_flag_map; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_item_flag_map (
    item_id integer,
    item_flag_id integer
);


ALTER TABLE pkm_item_flag_map OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 16849)
-- Name: pkm_item_flags; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_item_flags (
    item_flag_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    description text
);


ALTER TABLE pkm_item_flags OWNER TO postgres;

--
-- TOC entry 226 (class 1259 OID 16857)
-- Name: pkm_item_flavor_summaries; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_item_flavor_summaries (
    item_id integer,
    flavor_summary text
);


ALTER TABLE pkm_item_flavor_summaries OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 16863)
-- Name: pkm_item_flavor_text; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_item_flavor_text (
    item_id integer,
    version_group_id integer,
    flavor_text text
);


ALTER TABLE pkm_item_flavor_text OWNER TO postgres;

--
-- TOC entry 228 (class 1259 OID 16869)
-- Name: pkm_item_fling_effects; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_item_fling_effects (
    item_fling_effect_id integer NOT NULL,
    name_alias character varying(16),
    effect text
);


ALTER TABLE pkm_item_fling_effects OWNER TO postgres;

--
-- TOC entry 229 (class 1259 OID 16877)
-- Name: pkm_item_game_indices; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_item_game_indices (
    item_id integer,
    generation_id integer,
    game_index integer
);


ALTER TABLE pkm_item_game_indices OWNER TO postgres;

--
-- TOC entry 231 (class 1259 OID 16888)
-- Name: pkm_item_pockets; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_item_pockets (
    item_pocket_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_item_pockets OWNER TO postgres;

--
-- TOC entry 230 (class 1259 OID 16880)
-- Name: pkm_items; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_items (
    item_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32),
    item_category_id integer,
    cost integer,
    fling_power integer,
    item_fling_effect_id integer,
    short_effect text,
    effect text
);


ALTER TABLE pkm_items OWNER TO postgres;

--
-- TOC entry 232 (class 1259 OID 16893)
-- Name: pkm_location_area_encounter_rates; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_location_area_encounter_rates (
    location_area_id integer,
    encounter_method_id integer,
    version_id integer,
    rate integer
);


ALTER TABLE pkm_location_area_encounter_rates OWNER TO postgres;

--
-- TOC entry 233 (class 1259 OID 16896)
-- Name: pkm_location_areas; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_location_areas (
    location_area_id integer NOT NULL,
    location_id integer,
    game_index integer,
    name character varying(32),
    name_alias character varying(32)
);


ALTER TABLE pkm_location_areas OWNER TO postgres;

--
-- TOC entry 234 (class 1259 OID 16901)
-- Name: pkm_location_game_indices; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_location_game_indices (
    location_id integer,
    generation_id integer,
    game_index integer
);


ALTER TABLE pkm_location_game_indices OWNER TO postgres;

--
-- TOC entry 235 (class 1259 OID 16904)
-- Name: pkm_locations; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_locations (
    location_id integer NOT NULL,
    region_id integer,
    name character varying(32),
    name_alias character varying(32)
);


ALTER TABLE pkm_locations OWNER TO postgres;

--
-- TOC entry 236 (class 1259 OID 16909)
-- Name: pkm_machines; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_machines (
    machine_number integer,
    version_group_id integer,
    item_id integer,
    move_id integer
);


ALTER TABLE pkm_machines OWNER TO postgres;

--
-- TOC entry 237 (class 1259 OID 16912)
-- Name: pkm_move_battle_styles; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_battle_styles (
    move_battle_style_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_move_battle_styles OWNER TO postgres;

--
-- TOC entry 238 (class 1259 OID 16917)
-- Name: pkm_move_changelog; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_changelog (
    move_id integer,
    changed_in_version_group_id integer,
    type_id integer,
    power integer,
    pp integer,
    accuracy integer,
    priority integer,
    move_target_id integer,
    move_effect_id integer,
    effect_chance integer
);


ALTER TABLE pkm_move_changelog OWNER TO postgres;

--
-- TOC entry 239 (class 1259 OID 16920)
-- Name: pkm_move_damage_classes; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_damage_classes (
    move_damage_class_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    description text
);


ALTER TABLE pkm_move_damage_classes OWNER TO postgres;

--
-- TOC entry 240 (class 1259 OID 16928)
-- Name: pkm_move_effect_changelog; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_effect_changelog (
    move_effect_changelog_id integer NOT NULL,
    move_effect_id integer,
    changed_in_version_group_id integer,
    effect text
);


ALTER TABLE pkm_move_effect_changelog OWNER TO postgres;

--
-- TOC entry 241 (class 1259 OID 16936)
-- Name: pkm_move_effects; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_effects (
    move_effect_id integer NOT NULL,
    short_effect text,
    effect text
);


ALTER TABLE pkm_move_effects OWNER TO postgres;

--
-- TOC entry 242 (class 1259 OID 16944)
-- Name: pkm_move_flag_map; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_flag_map (
    move_id integer,
    move_flag_id integer
);


ALTER TABLE pkm_move_flag_map OWNER TO postgres;

--
-- TOC entry 243 (class 1259 OID 16947)
-- Name: pkm_move_flags; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_flags (
    move_flag_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32),
    description text
);


ALTER TABLE pkm_move_flags OWNER TO postgres;

--
-- TOC entry 244 (class 1259 OID 16956)
-- Name: pkm_move_flavor_summaries; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_flavor_summaries (
    move_id integer,
    flavor_summary text
);


ALTER TABLE pkm_move_flavor_summaries OWNER TO postgres;

--
-- TOC entry 245 (class 1259 OID 16962)
-- Name: pkm_move_flavor_text; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_flavor_text (
    move_id integer,
    version_group_id integer,
    flavor_text text
);


ALTER TABLE pkm_move_flavor_text OWNER TO postgres;

--
-- TOC entry 246 (class 1259 OID 16968)
-- Name: pkm_move_meta; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_meta (
    move_id integer,
    move_meta_category_id integer,
    move_meta_ailment_id integer,
    min_hits integer,
    max_hits integer,
    min_turns integer,
    max_turns integer,
    drain integer,
    healing integer,
    crit_rate integer,
    ailment_chance integer,
    flinch_chance integer,
    stat_chance integer
);


ALTER TABLE pkm_move_meta OWNER TO postgres;

--
-- TOC entry 247 (class 1259 OID 16971)
-- Name: pkm_move_meta_ailments; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_meta_ailments (
    move_meta_ailment_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_move_meta_ailments OWNER TO postgres;

--
-- TOC entry 248 (class 1259 OID 16976)
-- Name: pkm_move_meta_categories; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_meta_categories (
    move_meta_category_id integer NOT NULL,
    name_alias character varying(32),
    description text
);


ALTER TABLE pkm_move_meta_categories OWNER TO postgres;

--
-- TOC entry 249 (class 1259 OID 16984)
-- Name: pkm_move_meta_stat_changes; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_meta_stat_changes (
    move_id integer,
    stat_id integer,
    change integer
);


ALTER TABLE pkm_move_meta_stat_changes OWNER TO postgres;

--
-- TOC entry 251 (class 1259 OID 16992)
-- Name: pkm_move_targets; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_move_targets (
    move_target_id integer,
    name character varying(32),
    name_alias character varying(32),
    description text
);


ALTER TABLE pkm_move_targets OWNER TO postgres;

--
-- TOC entry 250 (class 1259 OID 16987)
-- Name: pkm_moves; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_moves (
    move_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32),
    generation_id integer,
    type_id integer,
    power integer,
    pp integer,
    accuracy integer,
    priority integer,
    move_target_id integer,
    move_damage_class_id integer,
    move_effect_id integer,
    effect_chance integer,
    contest_type_id integer,
    contest_effect_id integer,
    super_contest_effect_id integer
);


ALTER TABLE pkm_moves OWNER TO postgres;

--
-- TOC entry 252 (class 1259 OID 16998)
-- Name: pkm_nature_battle_style_preferences; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_nature_battle_style_preferences (
    nature_id integer,
    move_battle_style_id integer,
    low_hp_preference integer,
    high_hp_preference integer
);


ALTER TABLE pkm_nature_battle_style_preferences OWNER TO postgres;

--
-- TOC entry 254 (class 1259 OID 17006)
-- Name: pkm_nature_pokeathlon_stats; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_nature_pokeathlon_stats (
    nature_id integer,
    pokeathlon_stat_id integer,
    max_change integer
);


ALTER TABLE pkm_nature_pokeathlon_stats OWNER TO postgres;

--
-- TOC entry 253 (class 1259 OID 17001)
-- Name: pkm_natures; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_natures (
    nature_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    decreased_stat_id integer,
    increased_stat_id integer,
    hates_flavor_id integer,
    likes_flavor_id integer,
    game_index integer
);


ALTER TABLE pkm_natures OWNER TO postgres;

--
-- TOC entry 255 (class 1259 OID 17009)
-- Name: pkm_pal_park; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pal_park (
    pokemon_species_id integer,
    pal_park_area_id integer,
    base_score integer,
    rate integer
);


ALTER TABLE pkm_pal_park OWNER TO postgres;

--
-- TOC entry 256 (class 1259 OID 17012)
-- Name: pkm_pal_park_areas; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pal_park_areas (
    pal_park_area_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_pal_park_areas OWNER TO postgres;

--
-- TOC entry 257 (class 1259 OID 17017)
-- Name: pkm_pokeathlon_stats; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokeathlon_stats (
    pokeathlon_stat_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_pokeathlon_stats OWNER TO postgres;

--
-- TOC entry 259 (class 1259 OID 17031)
-- Name: pkm_pokedex_version_groups; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokedex_version_groups (
    pokedex_id integer,
    version_group_id integer
);


ALTER TABLE pkm_pokedex_version_groups OWNER TO postgres;

--
-- TOC entry 258 (class 1259 OID 17022)
-- Name: pkm_pokedexes; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokedexes (
    pokedex_id integer NOT NULL,
    region_id integer,
    name character varying(16),
    name_alias character varying(16),
    description text,
    is_main_series boolean DEFAULT true
);


ALTER TABLE pkm_pokedexes OWNER TO postgres;

--
-- TOC entry 260 (class 1259 OID 17034)
-- Name: pkm_pokemon; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon (
    pokemon_id integer NOT NULL,
    name_alias character varying(32),
    pokemon_species_id integer,
    height integer,
    weight integer,
    base_experience integer,
    order_no integer,
    is_default boolean DEFAULT true
);


ALTER TABLE pkm_pokemon OWNER TO postgres;

--
-- TOC entry 261 (class 1259 OID 17040)
-- Name: pkm_pokemon_abilities; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_abilities (
    pokemon_id integer,
    ability_id integer,
    is_hidden boolean DEFAULT false,
    slot integer
);


ALTER TABLE pkm_pokemon_abilities OWNER TO postgres;

--
-- TOC entry 262 (class 1259 OID 17044)
-- Name: pkm_pokemon_colors; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_colors (
    pokemon_color_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_pokemon_colors OWNER TO postgres;

--
-- TOC entry 263 (class 1259 OID 17049)
-- Name: pkm_pokemon_dex_numbers; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_dex_numbers (
    pokemon_species_id integer,
    pokedex_id integer,
    pokedex_number integer
);


ALTER TABLE pkm_pokemon_dex_numbers OWNER TO postgres;

--
-- TOC entry 264 (class 1259 OID 17052)
-- Name: pkm_pokemon_egg_groups; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_egg_groups (
    pokemon_species_id integer,
    egg_group_id integer
);


ALTER TABLE pkm_pokemon_egg_groups OWNER TO postgres;

--
-- TOC entry 265 (class 1259 OID 17055)
-- Name: pkm_pokemon_evolution; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_evolution (
    pokemon_evolution_id integer NOT NULL,
    evolved_species_id integer,
    evolution_trigger_id integer,
    trigger_item_id integer,
    minimum_level integer,
    gender_id integer,
    location_id integer,
    held_item_id integer,
    time_of_day character varying(16),
    known_move_id integer,
    known_move_type_id integer,
    minimum_happiness integer,
    minimum_beauty integer,
    minimum_affection integer,
    relative_physical_stats integer,
    party_species_id integer,
    party_type_id integer,
    trade_species_id integer,
    needs_overworld_rain boolean DEFAULT false,
    turn_upside_down boolean DEFAULT false
);


ALTER TABLE pkm_pokemon_evolution OWNER TO postgres;

--
-- TOC entry 266 (class 1259 OID 17062)
-- Name: pkm_pokemon_form_generations; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_form_generations (
    pokemon_form_id integer,
    generation_id integer,
    game_index integer
);


ALTER TABLE pkm_pokemon_form_generations OWNER TO postgres;

--
-- TOC entry 268 (class 1259 OID 17073)
-- Name: pkm_pokemon_form_pokeathlon_stats; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_form_pokeathlon_stats (
    pokemon_form_id integer,
    pokeathlon_stat_id integer,
    minimum_stat integer,
    base_stat integer,
    maximum_stat integer
);


ALTER TABLE pkm_pokemon_form_pokeathlon_stats OWNER TO postgres;

--
-- TOC entry 267 (class 1259 OID 17065)
-- Name: pkm_pokemon_forms; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_forms (
    pokemon_form_id integer NOT NULL,
    pokemon_name character varying(32),
    pokemon_name_alias character varying(32),
    form_name character varying(32),
    form_name_alias character varying(32),
    pokemon_id integer,
    introduced_in_version_group_id integer,
    is_default boolean DEFAULT true,
    is_battle_only boolean DEFAULT false,
    is_mega boolean DEFAULT false,
    form_order integer,
    order_no integer
);


ALTER TABLE pkm_pokemon_forms OWNER TO postgres;

--
-- TOC entry 269 (class 1259 OID 17076)
-- Name: pkm_pokemon_game_indices; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_game_indices (
    pokemon_id integer,
    version_id integer,
    game_index integer
);


ALTER TABLE pkm_pokemon_game_indices OWNER TO postgres;

--
-- TOC entry 270 (class 1259 OID 17079)
-- Name: pkm_pokemon_habitats; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_habitats (
    pokemon_habitat_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_pokemon_habitats OWNER TO postgres;

--
-- TOC entry 271 (class 1259 OID 17085)
-- Name: pkm_pokemon_items; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_items (
    pokemon_id integer,
    version_id integer,
    item_id integer,
    rarity integer
);


ALTER TABLE pkm_pokemon_items OWNER TO postgres;

--
-- TOC entry 272 (class 1259 OID 17088)
-- Name: pkm_pokemon_move_methods; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_move_methods (
    pokemon_move_method_id integer NOT NULL,
    name character varying(32),
    name_alias character varying(32),
    description text
);


ALTER TABLE pkm_pokemon_move_methods OWNER TO postgres;

--
-- TOC entry 273 (class 1259 OID 17096)
-- Name: pkm_pokemon_moves; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_moves (
    pokemon_id integer,
    version_group_id integer,
    move_id integer,
    pokemon_move_method_id integer,
    level integer,
    order_no integer
);


ALTER TABLE pkm_pokemon_moves OWNER TO postgres;

--
-- TOC entry 274 (class 1259 OID 17099)
-- Name: pkm_pokemon_shapes; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_shapes (
    pokemon_shape_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    name_awesome character varying(16),
    description text
);


ALTER TABLE pkm_pokemon_shapes OWNER TO postgres;

--
-- TOC entry 275 (class 1259 OID 17107)
-- Name: pkm_pokemon_species; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_species (
    pokemon_species_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    name_japanese character varying(16),
    genus character varying(32),
    generation_id integer,
    evolves_from_species_id integer,
    evolution_chain_id integer,
    pokemon_color_id integer,
    pokemon_shape_id integer,
    pokemon_habitat_id integer,
    gender_rate integer,
    capture_rate integer,
    base_happiness integer,
    is_baby boolean DEFAULT false,
    hatch_counter integer,
    has_gender_differences boolean DEFAULT false,
    growth_rate_id integer,
    forms_switchable boolean DEFAULT false,
    order_no integer,
    conquest_order integer,
    form_description text
);


ALTER TABLE pkm_pokemon_species OWNER TO postgres;

--
-- TOC entry 276 (class 1259 OID 17115)
-- Name: pkm_pokemon_species_flavor_summaries; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_species_flavor_summaries (
    pokemon_species_id integer,
    flavor_summary text
);


ALTER TABLE pkm_pokemon_species_flavor_summaries OWNER TO postgres;

--
-- TOC entry 277 (class 1259 OID 17121)
-- Name: pkm_pokemon_species_flavor_text; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_species_flavor_text (
    pokemon_species_id integer,
    version_id integer,
    flavor_text text
);


ALTER TABLE pkm_pokemon_species_flavor_text OWNER TO postgres;

--
-- TOC entry 278 (class 1259 OID 17127)
-- Name: pkm_pokemon_stats; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_stats (
    pokemon_id integer,
    stat_id integer,
    base_stat integer,
    effort integer
);


ALTER TABLE pkm_pokemon_stats OWNER TO postgres;

--
-- TOC entry 279 (class 1259 OID 17130)
-- Name: pkm_pokemon_types; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_pokemon_types (
    pokemon_id integer,
    type_id integer,
    slot integer
);


ALTER TABLE pkm_pokemon_types OWNER TO postgres;

--
-- TOC entry 174 (class 1259 OID 16588)
-- Name: pkm_regions; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_regions (
    region_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_regions OWNER TO postgres;

--
-- TOC entry 280 (class 1259 OID 17133)
-- Name: pkm_stats; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_stats (
    stat_id integer NOT NULL,
    move_damage_class_id integer,
    name character varying(16),
    name_alias character varying(16),
    is_battle_only boolean DEFAULT false,
    game_index integer
);


ALTER TABLE pkm_stats OWNER TO postgres;

--
-- TOC entry 281 (class 1259 OID 17139)
-- Name: pkm_super_contest_combos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_super_contest_combos (
    first_move_id integer,
    second_move_id integer
);


ALTER TABLE pkm_super_contest_combos OWNER TO postgres;

--
-- TOC entry 282 (class 1259 OID 17142)
-- Name: pkm_super_contest_effects; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_super_contest_effects (
    super_contest_effect_id integer NOT NULL,
    appeal integer,
    flavor_text text
);


ALTER TABLE pkm_super_contest_effects OWNER TO postgres;

--
-- TOC entry 283 (class 1259 OID 17150)
-- Name: pkm_type_efficacy; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_type_efficacy (
    damage_type_id integer,
    target_type_id integer,
    damage_factor integer
);


ALTER TABLE pkm_type_efficacy OWNER TO postgres;

--
-- TOC entry 284 (class 1259 OID 17153)
-- Name: pkm_type_game_indices; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_type_game_indices (
    type_id integer,
    generation_id integer,
    game_index integer
);


ALTER TABLE pkm_type_game_indices OWNER TO postgres;

--
-- TOC entry 285 (class 1259 OID 17156)
-- Name: pkm_types; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_types (
    type_id integer NOT NULL,
    name character varying(16),
    name_alias character varying(16),
    generation_id integer,
    move_damage_class_id integer
);


ALTER TABLE pkm_types OWNER TO postgres;

--
-- TOC entry 286 (class 1259 OID 17161)
-- Name: pkm_version_group_pokemon_move_methods; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_version_group_pokemon_move_methods (
    version_group_id integer,
    pokemon_move_method_id integer
);


ALTER TABLE pkm_version_group_pokemon_move_methods OWNER TO postgres;

--
-- TOC entry 178 (class 1259 OID 16608)
-- Name: pkm_version_group_regions; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_version_group_regions (
    version_group_id integer,
    region_id integer
);


ALTER TABLE pkm_version_group_regions OWNER TO postgres;

--
-- TOC entry 176 (class 1259 OID 16598)
-- Name: pkm_version_groups; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_version_groups (
    version_group_id integer NOT NULL,
    name_alias character varying(32),
    generation_id integer,
    order_no integer
);


ALTER TABLE pkm_version_groups OWNER TO postgres;

--
-- TOC entry 177 (class 1259 OID 16603)
-- Name: pkm_versions; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pkm_versions (
    version_id integer NOT NULL,
    version_group_id integer,
    name character varying(16),
    name_alias character varying(16)
);


ALTER TABLE pkm_versions OWNER TO postgres;

--
-- TOC entry 2391 (class 2606 OID 16627)
-- Name: pk_ability_changelog_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_ability_changelog
    ADD CONSTRAINT pk_ability_changelog_id PRIMARY KEY (ability_changelog_id);


--
-- TOC entry 2389 (class 2606 OID 16619)
-- Name: pk_ability_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_abilities
    ADD CONSTRAINT pk_ability_id PRIMARY KEY (ability_id);


--
-- TOC entry 2395 (class 2606 OID 16643)
-- Name: pk_berry_firmness_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_berry_firmness
    ADD CONSTRAINT pk_berry_firmness_id PRIMARY KEY (berry_firmness_id);


--
-- TOC entry 2393 (class 2606 OID 16638)
-- Name: pk_berry_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_berries
    ADD CONSTRAINT pk_berry_id PRIMARY KEY (berry_id);


--
-- TOC entry 2397 (class 2606 OID 16651)
-- Name: pk_characteristic_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_characteristics
    ADD CONSTRAINT pk_characteristic_id PRIMARY KEY (characteristic_id);


--
-- TOC entry 2399 (class 2606 OID 16659)
-- Name: pk_conquest_episode_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_episodes
    ADD CONSTRAINT pk_conquest_episode_id PRIMARY KEY (conquest_episode_id);


--
-- TOC entry 2401 (class 2606 OID 16672)
-- Name: pk_conquest_kingdom_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_kingdoms
    ADD CONSTRAINT pk_conquest_kingdom_id PRIMARY KEY (conquest_kingdom_id);


--
-- TOC entry 2403 (class 2606 OID 16686)
-- Name: pk_conquest_move_displacement_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_move_displacements
    ADD CONSTRAINT pk_conquest_move_displacement_id PRIMARY KEY (conquest_move_displacement_id);


--
-- TOC entry 2405 (class 2606 OID 16694)
-- Name: pk_conquest_move_effect_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_move_effects
    ADD CONSTRAINT pk_conquest_move_effect_id PRIMARY KEY (conquest_move_effect_id);


--
-- TOC entry 2407 (class 2606 OID 16703)
-- Name: pk_conquest_move_range_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_move_ranges
    ADD CONSTRAINT pk_conquest_move_range_id PRIMARY KEY (conquest_move_range_id);


--
-- TOC entry 2409 (class 2606 OID 16722)
-- Name: pk_conquest_stat_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_stats
    ADD CONSTRAINT pk_conquest_stat_id PRIMARY KEY (conquest_stat_id);


--
-- TOC entry 2411 (class 2606 OID 16733)
-- Name: pk_conquest_warrior_archetype_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_warrior_archetypes
    ADD CONSTRAINT pk_conquest_warrior_archetype_id PRIMARY KEY (conquest_warrior_archetype_id);


--
-- TOC entry 2413 (class 2606 OID 16738)
-- Name: pk_conquest_warrior_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_warriors
    ADD CONSTRAINT pk_conquest_warrior_id PRIMARY KEY (conquest_warrior_id);


--
-- TOC entry 2415 (class 2606 OID 16746)
-- Name: pk_conquest_warrior_rank_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_warrior_ranks
    ADD CONSTRAINT pk_conquest_warrior_rank_id PRIMARY KEY (conquest_warrior_rank_id);


--
-- TOC entry 2417 (class 2606 OID 16751)
-- Name: pk_conquest_warrior_skill_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_warrior_skills
    ADD CONSTRAINT pk_conquest_warrior_skill_id PRIMARY KEY (conquest_warrior_skill_id);


--
-- TOC entry 2419 (class 2606 OID 16759)
-- Name: pk_conquest_warrior_stat_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_conquest_warrior_stats
    ADD CONSTRAINT pk_conquest_warrior_stat_id PRIMARY KEY (conquest_warrior_stat_id);


--
-- TOC entry 2421 (class 2606 OID 16774)
-- Name: pk_contest_effect_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_contest_effects
    ADD CONSTRAINT pk_contest_effect_id PRIMARY KEY (contest_effect_id);


--
-- TOC entry 2423 (class 2606 OID 16779)
-- Name: pk_contest_type_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_contest_types
    ADD CONSTRAINT pk_contest_type_id PRIMARY KEY (contest_type_id);


--
-- TOC entry 2425 (class 2606 OID 16784)
-- Name: pk_egg_group_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_egg_groups
    ADD CONSTRAINT pk_egg_group_id PRIMARY KEY (egg_group_id);


--
-- TOC entry 2427 (class 2606 OID 16789)
-- Name: pk_encounter_condition_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_encounter_conditions
    ADD CONSTRAINT pk_encounter_condition_id PRIMARY KEY (encounter_condition_id);


--
-- TOC entry 2429 (class 2606 OID 16798)
-- Name: pk_encounter_condition_value_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_encounter_condition_values
    ADD CONSTRAINT pk_encounter_condition_value_id PRIMARY KEY (encounter_condition_value_id);


--
-- TOC entry 2435 (class 2606 OID 16813)
-- Name: pk_encounter_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_encounters
    ADD CONSTRAINT pk_encounter_id PRIMARY KEY (encounter_id);


--
-- TOC entry 2431 (class 2606 OID 16803)
-- Name: pk_encounter_method_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_encounter_methods
    ADD CONSTRAINT pk_encounter_method_id PRIMARY KEY (encounter_method_id);


--
-- TOC entry 2433 (class 2606 OID 16808)
-- Name: pk_encounter_slot_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_encounter_slots
    ADD CONSTRAINT pk_encounter_slot_id PRIMARY KEY (encounter_slot_id);


--
-- TOC entry 2437 (class 2606 OID 16818)
-- Name: pk_evolution_chain_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_evolution_chains
    ADD CONSTRAINT pk_evolution_chain_id PRIMARY KEY (evolution_chain_id);


--
-- TOC entry 2439 (class 2606 OID 16823)
-- Name: pk_evolution_trigger_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_evolution_triggers
    ADD CONSTRAINT pk_evolution_trigger_id PRIMARY KEY (evolution_trigger_id);


--
-- TOC entry 2441 (class 2606 OID 16831)
-- Name: pk_gender_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_genders
    ADD CONSTRAINT pk_gender_id PRIMARY KEY (gender_id);


--
-- TOC entry 2383 (class 2606 OID 16597)
-- Name: pk_generation_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_generations
    ADD CONSTRAINT pk_generation_id PRIMARY KEY (generation_id);


--
-- TOC entry 2443 (class 2606 OID 16840)
-- Name: pk_growth_rate_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_growth_rates
    ADD CONSTRAINT pk_growth_rate_id PRIMARY KEY (growth_rate_id);


--
-- TOC entry 2445 (class 2606 OID 16845)
-- Name: pk_item_category_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_item_categories
    ADD CONSTRAINT pk_item_category_id PRIMARY KEY (item_category_id);


--
-- TOC entry 2447 (class 2606 OID 16856)
-- Name: pk_item_flag_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_item_flags
    ADD CONSTRAINT pk_item_flag_id PRIMARY KEY (item_flag_id);


--
-- TOC entry 2449 (class 2606 OID 16876)
-- Name: pk_item_fling_effect_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_item_fling_effects
    ADD CONSTRAINT pk_item_fling_effect_id PRIMARY KEY (item_fling_effect_id);


--
-- TOC entry 2451 (class 2606 OID 16887)
-- Name: pk_item_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_items
    ADD CONSTRAINT pk_item_id PRIMARY KEY (item_id);


--
-- TOC entry 2453 (class 2606 OID 16892)
-- Name: pk_item_pocket_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_item_pockets
    ADD CONSTRAINT pk_item_pocket_id PRIMARY KEY (item_pocket_id);


--
-- TOC entry 2455 (class 2606 OID 16900)
-- Name: pk_location_area_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_location_areas
    ADD CONSTRAINT pk_location_area_id PRIMARY KEY (location_area_id);


--
-- TOC entry 2457 (class 2606 OID 16908)
-- Name: pk_location_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_locations
    ADD CONSTRAINT pk_location_id PRIMARY KEY (location_id);


--
-- TOC entry 2459 (class 2606 OID 16916)
-- Name: pk_move_battle_style_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_move_battle_styles
    ADD CONSTRAINT pk_move_battle_style_id PRIMARY KEY (move_battle_style_id);


--
-- TOC entry 2461 (class 2606 OID 16927)
-- Name: pk_move_damage_class_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_move_damage_classes
    ADD CONSTRAINT pk_move_damage_class_id PRIMARY KEY (move_damage_class_id);


--
-- TOC entry 2463 (class 2606 OID 16935)
-- Name: pk_move_effect_changelog_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_move_effect_changelog
    ADD CONSTRAINT pk_move_effect_changelog_id PRIMARY KEY (move_effect_changelog_id);


--
-- TOC entry 2465 (class 2606 OID 16943)
-- Name: pk_move_effect_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_move_effects
    ADD CONSTRAINT pk_move_effect_id PRIMARY KEY (move_effect_id);


--
-- TOC entry 2467 (class 2606 OID 16954)
-- Name: pk_move_flag_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_move_flags
    ADD CONSTRAINT pk_move_flag_id PRIMARY KEY (move_flag_id);


--
-- TOC entry 2473 (class 2606 OID 16991)
-- Name: pk_move_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_moves
    ADD CONSTRAINT pk_move_id PRIMARY KEY (move_id);


--
-- TOC entry 2469 (class 2606 OID 16975)
-- Name: pk_move_meta_ailment_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_move_meta_ailments
    ADD CONSTRAINT pk_move_meta_ailment_id PRIMARY KEY (move_meta_ailment_id);


--
-- TOC entry 2471 (class 2606 OID 16983)
-- Name: pk_move_meta_category_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_move_meta_categories
    ADD CONSTRAINT pk_move_meta_category_id PRIMARY KEY (move_meta_category_id);


--
-- TOC entry 2475 (class 2606 OID 17005)
-- Name: pk_nature_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_natures
    ADD CONSTRAINT pk_nature_id PRIMARY KEY (nature_id);


--
-- TOC entry 2477 (class 2606 OID 17016)
-- Name: pk_pal_park_area_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pal_park_areas
    ADD CONSTRAINT pk_pal_park_area_id PRIMARY KEY (pal_park_area_id);


--
-- TOC entry 2479 (class 2606 OID 17021)
-- Name: pk_pokeathlon_stat_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokeathlon_stats
    ADD CONSTRAINT pk_pokeathlon_stat_id PRIMARY KEY (pokeathlon_stat_id);


--
-- TOC entry 2481 (class 2606 OID 17030)
-- Name: pk_pokedex_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokedexes
    ADD CONSTRAINT pk_pokedex_id PRIMARY KEY (pokedex_id);


--
-- TOC entry 2485 (class 2606 OID 17048)
-- Name: pk_pokemon_color_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokemon_colors
    ADD CONSTRAINT pk_pokemon_color_id PRIMARY KEY (pokemon_color_id);


--
-- TOC entry 2487 (class 2606 OID 17061)
-- Name: pk_pokemon_evolution_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokemon_evolution
    ADD CONSTRAINT pk_pokemon_evolution_id PRIMARY KEY (pokemon_evolution_id);


--
-- TOC entry 2489 (class 2606 OID 17072)
-- Name: pk_pokemon_form_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokemon_forms
    ADD CONSTRAINT pk_pokemon_form_id PRIMARY KEY (pokemon_form_id);


--
-- TOC entry 2491 (class 2606 OID 17083)
-- Name: pk_pokemon_habitat_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokemon_habitats
    ADD CONSTRAINT pk_pokemon_habitat_id PRIMARY KEY (pokemon_habitat_id);


--
-- TOC entry 2483 (class 2606 OID 17039)
-- Name: pk_pokemon_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokemon
    ADD CONSTRAINT pk_pokemon_id PRIMARY KEY (pokemon_id);


--
-- TOC entry 2493 (class 2606 OID 17095)
-- Name: pk_pokemon_move_method_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokemon_move_methods
    ADD CONSTRAINT pk_pokemon_move_method_id PRIMARY KEY (pokemon_move_method_id);


--
-- TOC entry 2495 (class 2606 OID 17106)
-- Name: pk_pokemon_shape_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokemon_shapes
    ADD CONSTRAINT pk_pokemon_shape_id PRIMARY KEY (pokemon_shape_id);


--
-- TOC entry 2497 (class 2606 OID 17114)
-- Name: pk_pokemon_species_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_pokemon_species
    ADD CONSTRAINT pk_pokemon_species_id PRIMARY KEY (pokemon_species_id);


--
-- TOC entry 2381 (class 2606 OID 16592)
-- Name: pk_region_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_regions
    ADD CONSTRAINT pk_region_id PRIMARY KEY (region_id);


--
-- TOC entry 2499 (class 2606 OID 17138)
-- Name: pk_stat_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_stats
    ADD CONSTRAINT pk_stat_id PRIMARY KEY (stat_id);


--
-- TOC entry 2501 (class 2606 OID 17149)
-- Name: pk_super_contest_effect_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_super_contest_effects
    ADD CONSTRAINT pk_super_contest_effect_id PRIMARY KEY (super_contest_effect_id);


--
-- TOC entry 2503 (class 2606 OID 17160)
-- Name: pk_type_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_types
    ADD CONSTRAINT pk_type_id PRIMARY KEY (type_id);


--
-- TOC entry 2385 (class 2606 OID 16602)
-- Name: pk_version_group_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_version_groups
    ADD CONSTRAINT pk_version_group_id PRIMARY KEY (version_group_id);


--
-- TOC entry 2387 (class 2606 OID 16607)
-- Name: pk_version_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pkm_versions
    ADD CONSTRAINT pk_version_id PRIMARY KEY (version_id);


--
-- TOC entry 2618 (class 0 OID 0)
-- Dependencies: 8
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2017-10-05 13:49:41

--
-- PostgreSQL database dump complete
--

