public class EulerSolver implements PhysicsEngine{
    
}
//  g = (−𝑚𝑔h,𝑥 (𝑥, 𝑦), −𝑚𝑔h,𝑦 (𝑥, 𝑦));
// frictionF= −𝜇𝑚𝑔 𝑣⁄‖𝑣‖;
/*Equations of motion below
 𝑥̈ =−𝑔h,𝑥(𝑥,𝑦)−𝜇𝑔𝑥̇⁄√𝑥̇2 +𝑦̇2; 𝑦̈ =−𝑔h,𝑦(𝑥,𝑦)−𝜇𝑔𝑦̇⁄√𝑥̇2 +𝑦̇2 
 The physics of a ball moving on a hilly surface, of height 𝑧 = h(𝑥, 𝑦) is defined as follows:
 We require the partial derivatives
 𝜕𝑧 = h,𝑥(𝑥, 𝑦) ≔ lim h(𝑥+𝛿𝑥,𝑦)−h(𝑥,𝑦) ; 𝜕𝑧 = h,𝑦(𝑥, 𝑦) ≔ lim h(𝑥,𝑦+𝛿𝑦)−h(𝑥,𝑦) .
 𝜕𝑥 𝛿𝑥→0 𝛿𝑥 𝜕𝑦 𝛿𝑦→0 𝛿𝑦

 The equations of motion are
 𝑝̈ = 𝑎 = 𝐹⁄𝑚
 where 𝐹 = 𝐹(𝑝, 𝑝̇) = 𝐹(𝑝, 𝑣) = 𝐺 + 𝐻 is the total force applied.
 */