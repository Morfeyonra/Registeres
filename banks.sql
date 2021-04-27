--
-- PostgreSQL database dump
--

-- Dumped from database version 12.6
-- Dumped by pg_dump version 12.6

-- Started on 2021-04-27 15:38:51

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
-- TOC entry 556 (class 1259 OID 21041)
-- Name: banks; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.banks (
    uuid_ character varying(75),
    bank_name character varying(75) NOT NULL,
    bik character varying(75) NOT NULL,
    address character varying(75)
);


ALTER TABLE public.banks OWNER TO postgres;

--
-- TOC entry 4090 (class 0 OID 21041)
-- Dependencies: 556
-- Data for Name: banks; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.banks VALUES ('7a41e841-8401-6840-580e-9b581929b307', 'BankReiden', '456278913', 'Reiden temple 22');
INSERT INTO public.banks VALUES ('0c2f3dde-c92f-4d72-7ac5-14b739c8e791', 'CageInc', '216345147', 'LA, JK street 43');
INSERT INTO public.banks VALUES ('44969202-e7db-2485-df23-0bd3a7075370', 'ShaokanInvestments', '666999666', 'Inner planes, Evil street 88');


--
-- TOC entry 3952 (class 2606 OID 21045)
-- Name: banks banks_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.banks
    ADD CONSTRAINT banks_pkey PRIMARY KEY (bank_name, bik);


--
-- TOC entry 3953 (class 1259 OID 21059)
-- Name: ix_dc09b757; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_dc09b757 ON public.banks USING btree (uuid_);


-- Completed on 2021-04-27 15:38:52

--
-- PostgreSQL database dump complete
--

