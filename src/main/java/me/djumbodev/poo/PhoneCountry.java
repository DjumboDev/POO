package me.djumbodev.poo;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum PhoneCountry {
   // Region 1 North America
   UNITED_STATES(1,1),
   CANADA(1,1),

   // Region 2 Europe
   GREECE(3,30),
   NETHERLANDS(3,31),
   BELGIUM(3,32),
   FRANCE(3,33),
   SPAIN(3,34);

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

    public static Set<PhoneCountry> getAllByRegionCode(int regionCode) {
        final EnumSet<PhoneCountry> set = REGION_CODE_LOOKUP.get(regionCode);
        return set == null ? Set.of() : Set.copyOf(set);
    }

    public static Set<PhoneCountry> getAllByCountryCode(int countryCode) {
        final EnumSet<PhoneCountry> set = COUNTRY_CODE_LOOKUP.get(countryCode);
        return set == null ? Set.of() : Set.copyOf(set);
    }

    public static PhoneCountry getFirstByCountryCode(int countryCode) {
        return getAllByCountryCode(countryCode).iterator().next();
    }
}
