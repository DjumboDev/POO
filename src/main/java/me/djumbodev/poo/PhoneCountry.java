package me.djumbodev.poo;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum PhoneCountry {
   // Region 1 North America
    // UNITED_STATES ETAT INCLUANT TERRITOIRE
   UNITED_STATES(1,1),
    UNITED_STATES_VIRGIN_ISLANDS(1,340),
    NOTHERN_MARIANA_ISLANDS(1,670),
    GUAM(1,671),
    AMERICAN_SAMOA(1,684),
    PUERTO_RICO(1,787),    //939

    CANADA(1,1),
    // OTHER COUNTRIES
    BAHAMAS(1,242),
    BARBADOS(1,246),
    ANGUILLA(1,264),
    ANTIGUA_AND_BARBUDA(1,268),
    BRITISH_VIRGIN_ISLANDS(1,284),
    CAYMAN_ISLANDS(1,345),
    BERMUDA(1,441),
    GRENADA(1,473),
    TURKS_AND_CAICOS_ISLANDS(1,649),
    JAMAICA(1,658), //876 double code
    MONTSERRAT(1,664),
    SINT_MAARTEN(1,721),
    SAINT_LUCIA(1,758),
    DOMINICA(1,767),
    SAINT_VINCENT_AND_THE_GRENADINES(1,784),
    DOMINICAN_REPUBLIC(1,809), //829,849 other codes related to this
    TRINIDAD_AND_TOBAGO(1,868),
    SAINT_KITSS_AND_NEVIS(1,869),

   // Region 2 Europe
   GREECE(3,30),
   NETHERLANDS(3,31),
   BELGIUM(3,32),
   FRANCE(3,33),
   SPAIN(3,34),
    GIBRALTAR(3,340),
    PORTUGAL(3,341),
    LUXEMBOURG(3,352),
    IRELAND(3,353),
   ICELAND(3,354),
    ALBANIA(3,355),
    MALTA(3,356),
    CYPRUS(3,357),
    FINLAND(3,358),
    ALAND(3,358),
    BULGARIA(3,359),
    LITHUANIA(3,370),
    LATVIA(3,371),
    ESTONIA(3,372),
    MOLDOVA(3,373),
    ARMENIA(3,374),
    BELARUS(3,375),
    ANDORRA(3,376),
    MONACO(3,377),
    SAN_MARINO(3,378),
    VATICAN_CITY(3,379),
    UKRAINE(3,380),
    SERBIA(3,381),
    MONTENEGRO(3,382),
    KOSOVO(3,383),
    CROATIA(3,385),
    SLOVENIA(3,386),
    BOSNIA_AND_HERZEGOVINA(3,387),
    NORTH_MACEDONIA(3,389),
    ITALY(3,39),
    ROMANIA(3,40),
    SWITZERLAND(3,41),
    CZEH_REPUBLIC(3,420),
    SLOVAKIA(3,421),
    LIECHTENSTEIN(3,423),
    AUSTRIA(3,43),
    UNITED_KINGDOM(3,44),
    DENMARK(3,45),
    SWEDEN(3,46),
    NORWAY(3,47),
    SVALBARD(3,47),
    POLAND(3,48),
    GERMANY(3,49);






    private static final Map<Integer, EnumSet<PhoneCountry>> REGION_CODE_LOOKUP = new HashMap<>();
    private static final Map<Integer, EnumSet<PhoneCountry>> COUNTRY_CODE_LOOKUP = new HashMap<>();

    static {
        for(PhoneCountry country : PhoneCountry.values()) {
            REGION_CODE_LOOKUP
                .computeIfAbsent(country.regionCode, (_) -> EnumSet.noneOf(PhoneCountry.class))
                .add(country);
            COUNTRY_CODE_LOOKUP
                .computeIfAbsent(country.countryCode, (_) -> EnumSet.noneOf(PhoneCountry.class))
                .add(country);
        }
    }

    private final int regionCode;
    private final int countryCode;

    PhoneCountry(int regionCode, int countryCode){
       this.regionCode = regionCode;
       this.countryCode = countryCode;
    }

    public int getRegionCode(){
       return this.regionCode;
    }

    public int getCountryCode(){
       return this.countryCode;
    }

    public static Set<PhoneCountry> getAllByRegionCodes(int regionCode) {
        final EnumSet<PhoneCountry> set = REGION_CODE_LOOKUP.get(regionCode);
        return set == null ? Set.of() : Set.copyOf(set);
    }

    public static PhoneCountry getFirstByRegionCode(int regionCode) {
        return getAllByRegionCodes(regionCode).iterator().next();
    }

    public static Set<PhoneCountry> getAllByCountryCodes(int countryCode) {
        final EnumSet<PhoneCountry> set = COUNTRY_CODE_LOOKUP.get(countryCode);
        return set == null ? Set.of() : Set.copyOf(set);
    }

    public static PhoneCountry getFirstByCountryCode(int countryCode) {
        return getAllByCountryCodes(countryCode).iterator().next();
    }
}
