# taller-de-variable-{
public static void main(String[] args) {
double d1, d2, d3;
double t1, t2, t3; 
double l1, l2, l3; 
double precioLitro; 
double masaCargaKg; // kg
double largo, ancho, alto; // m
double p1, p2, p3; // peajes $
double deprecPorKm; // $/km
double volCamionM3; // m³
double fCO2; // kg/L
double galPorLitro; // gal/L
d1 = d2 = d3 = 0;
t1 = t2 = t3 = 0;
l1 = l2 = l3 = 0;
precioLitro = 0;
masaCargaKg = 0;
largo = ancho = alto = 0;
p1 = p2 = p3 = 0;
deprecPorKm = 0;
volCamionM3 = 0;
fCO2 = 0;
galPorLitro = 0;

double v1 = d1 / t1;
double v2 = d2 / t2;
double v3 = d3 / t3;
double vprom = (d1*v1 + d2*v2 + d3*v3) / (d1+d2+d3);
double kml1 = d1 / l1;
double kml2 = d2 / l2;
double kml3 = d3 / l3;
double kmltotal = (d1+d2+d3) / (l1+l2+l3);

double costoComb = (l1+l2+l3) * precioLitro;
double deprec = (d1+d2+d3) * deprecPorKm;
double peajes = p1+p2+p3;
double costoDirecto = costoComb + deprec + peajes;
double costoPorKm = costoDirecto / (d1+d2+d3);
=
double volumenM3 = largo*ancho*alto;
double densidad = masaCargaKg/volumenM3;
double ocupacion = volumenM3/volCamionM3;
double COTotal = (l1+l2+l3)*fCO2;
double COporKm = COTotal/(d1+d2+d3);

double vprom_ms = vprom*1000/3600;
double galTot = (l1+l2+l3)*galPorLitro;
double vmin, vmax; // valores supuestos para normalización
vmin = vmax = 0;
double vnorm = (vprom-vmin)/(vmax-vmin);

double vmedia = (v1+v2+v3)/3;
double sigma = Math.sqrt(((v1-vmedia)*(v1-vmedia) + (v2-vmedia)*(v2-vmedia) + (v3-vmedia)*(v3-vmedia))/3);
double vpond_t = (t1*v1 + t2*v2 + t3*v3)/(t1+t2+t3);

double va, vb, ca, cb; // valores de referencia
va = vb = ca = cb = 0;
double c_vprom = ca + (cb-ca)*(vprom-va)/(vb-va);
double costoMant = c_vprom*(d1+d2+d3);

double a, b, c; // coeficientes del polinomio
a = b = c = 0;
double kmlModelo = a*vprom*vprom + b*vprom + c;        
double litrosModelo = (d1+d2+d3)/kmlModelo;

double w1, w2, w3, w4; // pesos
w1 = w2 = w3 = w4 = 0;
double score = w1*(1/costoPorKm) + w2*(kmltotal) + w3*(1/COporKm) + w4*(1/(1+sigma));

System.out.println("=== Taller Logística ===");
System.out.println("Velocidades: " + v1 + ", " + v2 + ", " + v3);
System.out.println("Velocidad promedio: " + vprom);
System.out.println("Rendimiento total km/L: " + kmltotal);
System.out.println("Costo por km: " + costoPorKm);
System.out.println("Densidad carga: " + densidad);
System.out.println("CO2 total: " + COTotal);
System.out.println("vprom m/s: " + vprom_ms);
System.out.println("Normalización velocidad: " + vnorm);
System.out.println("Sigma: " + sigma);
System.out.println("Costo mant.: " + costoMant);
System.out.println("Litros modelo: " + litrosModelo);
System.out.println("score eficiencia: " + score);}
}
