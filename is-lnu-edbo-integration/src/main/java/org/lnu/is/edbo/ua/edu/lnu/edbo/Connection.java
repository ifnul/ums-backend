package org.lnu.is.edbo.ua.edu.lnu.edbo;

import org.lnu.is.edbo.guides_min.EDBOGuides;
import org.lnu.is.edbo.guides_min.EDBOGuidesSoap;
import org.lnu.is.edbo.person_min.EDBOPerson;
import org.lnu.is.edbo.person_min.EDBOPersonSoap;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


class ConnectionEDBO
    {
        public static Boolean UpdateData = true;
        public static String SessionGuid;
        public static int YearSeason = 5;
        public static String DefaultTable = "lnu";
        private static ConnectionEDBO instance;
        static public ConnectionEDBO Instance() throws RemoteException
        {
            return instance==null?instance = new ConnectionEDBO():instance; 
        }
        private int idGuides;
        private int countGuides;
        private int idPerson;
        private int countPerson;
        private List<EDBOGuidesSoap> allGuides;
        private List<EDBOPersonSoap> allPerson;

        public synchronized EDBOGuidesSoap GetGuides()
        {
                idGuides++;
                if (idGuides >= countGuides) idGuides = 0;
                return allGuides.get(idGuides);
        }

        public synchronized EDBOPersonSoap GetPerson()
        {
                idPerson++;
                if (idPerson >= countPerson) idPerson = 0;
                return allPerson.get(idPerson);
        }
        class Ips
        {
            public String Ip;
            public String Port;
            public Ips(String Ip, String Port)
            {
            	this.Ip = Ip;
            	this.Port = Port;
            }
        }

        private ConnectionEDBO() throws RemoteException
        {
            Ips[] lc = new Ips[]
                {
                    new Ips("217.76.194.102","8080"),
                    new Ips ("192.168.102.51", "8080"),
                    new Ips ("127.0.0.1", "8081"),
                    new Ips ("10.2.4.35", "8080"),
                    new Ips ("194.44.198.43", "8080"),
                    new Ips ("127.0.0.1", "9091"),
                    new Ips ("127.0.0.1", "9092"),
                    new Ips ("127.0.0.1", "9093"),
                    new Ips ("127.0.0.1", "9094"),
                    new Ips ("127.0.0.1", "9095"),
                    new Ips ("127.0.0.1", "9096"),
                    new Ips ("127.0.0.1", "9097"),
                    new Ips ("127.0.0.1", "9098"),
                    
                    new Ips ("test.edbo.gov.ua", "80")
                };
            String[] lu =
                new String[]{"jarmola.galina@edbo.gov.ua",
                        "100cneltynb",
                        "PJUrUesv$3!4T)xyZ@URc5Ne-1^SdHojyFO$wgj!$F!z%@y#_Livz_58_Ps&oYrGP0FoGHbT181V(npmDcWSy*9CY3*5#sXppE8oFkFNJOSQtk$8AfOkcXhW^dO1Pu4K"
                    };

            /* var lu =
                 new[]{"marchenko.volodimir@edbo.gov.ua",
                         "martell5vs5vs",
                         "PJUrUesv$3!4T)xyZ@URc5Ne-1^SdHojyFO$wgj!$F!z%@y#_Livz_58_Ps&oYrGP0FoGHbT181V(npmDcWSy*9CY3*5#sXppE8oFkFNJOSQtk$8AfOkcXhW^dO1Pu4K"
                     };*/
            Boolean[] enable = new Boolean[] { false, true, false, true, true, false, false, false, false, false, false, false };
            final int count = 12;
            countGuides = 0;
            countPerson = 0;
            allGuides = new ArrayList<EDBOGuidesSoap>();
            allPerson = new ArrayList<EDBOPersonSoap>();
            /*for (int i = 0; i < count; i++)
            {
                if (!enable[i]) continue;
                
                allGuides.add(new EDBOGuides("http://"+lc[i].Ip+":"+lc[i].Port+"/EDBOGuides/EDBOGuides.asmx"));
                allPerson.add(new EDBOPersonSoap("http://"+lc[i].Ip+":"+lc[i].Port+"/EDBOPerson/EDBOPerson.asmx"));
                countGuides++;
                countPerson++;
            }*/
            EDBOGuides edboGuides = new EDBOGuides();
            EDBOGuidesSoap edboGuidesSoap = edboGuides.getEDBOGuidesSoap();
            allGuides.add(edboGuidesSoap);
            EDBOPerson edboPerson = new EDBOPerson();
            EDBOPersonSoap edboPersonSoap = edboPerson.getEDBOPersonSoap();
            allPerson.add(edboPersonSoap);

            EDBOGuidesSoap login = GetGuides();
            SessionGuid = login.login(lu[0], lu[1], 1, lu[2]);
        }
    }
