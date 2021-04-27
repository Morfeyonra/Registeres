--
-- PostgreSQL database dump
--

-- Dumped from database version 12.6
-- Dumped by pg_dump version 12.6

-- Started on 2021-04-27 15:31:11

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 558 (class 1259 OID 21051)
-- Name: staff_roster; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.staff_roster (
    worker_id integer NOT NULL,
    last_name character varying(75),
    first_name character varying(75),
    middle_name character varying(75),
    birth_date timestamp without time zone,
    "position" character varying(75),
    employment_date timestamp without time zone,
    salary integer,
    work_phone_num character varying(75),
    mobile_phone_num character varying(75),
    bank character varying(75),
    archive boolean
);


ALTER TABLE public.staff_roster OWNER TO postgres;

--
-- TOC entry 4089 (class 0 OID 21051)
-- Dependencies: 558
-- Data for Name: staff_roster; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.staff_roster VALUES (301, 'Officer', 'Stricker', NULL, '1992-08-09 00:00:00', 'Fighter', '1992-08-09 00:00:00', 0, '89991374512', NULL, 'CageInc', true);
INSERT INTO public.staff_roster VALUES (103, 'Cage', 'Jonny', NULL, '1992-04-12 00:00:00', 'Telezvezda', '2011-05-05 00:00:00', 999999, '89999999999', '89998886523', 'CageInc', false);
INSERT INTO public.staff_roster VALUES (202, 'Sibot', 'Noob', NULL, '1995-08-09 00:00:00', 'Fighter', '2011-04-22 00:00:00', 10000, NULL, NULL, 'ShaokanInvestments', false);
INSERT INTO public.staff_roster VALUES (203, 'Lu', 'Kang', NULL, '1992-06-15 00:00:00', 'Champion', '2011-07-11 00:00:00', 15000, NULL, NULL, 'BankReiden', false);
INSERT INTO public.staff_roster VALUES (204, 'Blade', 'Sonya', NULL, '1992-08-09 00:00:00', 'Fighter', '2011-12-27 00:00:00', 15000, '89134563218', '89628756654', 'CageInc', false);
INSERT INTO public.staff_roster VALUES (201, NULL, 'Kitana', 'Shaokanovna', '1992-01-01 00:00:00', 'Fighter', '2011-04-01 00:00:00', 10000, NULL, NULL, 'ShaokanInvestments', false);
INSERT INTO public.staff_roster VALUES (501, 'Kung', 'Lao', NULL, '1997-03-27 00:00:00', 'Fighter', '2021-04-27 00:00:00', 15000, NULL, NULL, 'BankReiden', false);


--
-- TOC entry 3952 (class 2606 OID 21058)
-- Name: staff_roster staff_roster_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.staff_roster
    ADD CONSTRAINT staff_roster_pkey PRIMARY KEY (worker_id);


-- Completed on 2021-04-27 15:31:11

--
-- PostgreSQL database dump complete
--

