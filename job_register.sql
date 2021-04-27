--
-- PostgreSQL database dump
--

-- Dumped from database version 12.6
-- Dumped by pg_dump version 12.6

-- Started on 2021-04-27 15:37:32

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
-- TOC entry 557 (class 1259 OID 21046)
-- Name: job_register; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.job_register (
    "position" character varying(75) NOT NULL,
    archive boolean
);


ALTER TABLE public.job_register OWNER TO postgres;

--
-- TOC entry 4089 (class 0 OID 21046)
-- Dependencies: 557
-- Data for Name: job_register; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.job_register VALUES ('Telezvezda', false);
INSERT INTO public.job_register VALUES ('Mercenary', true);
INSERT INTO public.job_register VALUES ('Champion', false);
INSERT INTO public.job_register VALUES ('Fighter', false);


--
-- TOC entry 3952 (class 2606 OID 21050)
-- Name: job_register job_register_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_register
    ADD CONSTRAINT job_register_pkey PRIMARY KEY ("position");


-- Completed on 2021-04-27 15:37:33

--
-- PostgreSQL database dump complete
--

